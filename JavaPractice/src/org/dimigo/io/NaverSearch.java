/**
 * 
 */
package org.dimigo.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * <pre>
 * org.dimigo.io
 *   |_ NaverSearch
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 9. 28.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class NaverSearch {

	public static final String NAVER_OPEN_URL = "http://openapi.naver.com/search";
	public static final String SEARCH_KEY = "f45d2780e74669231a450c8cb3ffc78f";
	
	public static void main(String[] args) {		
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
	    try {
	    	String keyword = null;
	    	
	    	try(InputStream is = System.in) {
	    		
	    		int result;
	    		
	    		
	    		while((result = is.read())!='\n') {
	    			keyword += (char)result;
	    		}
	    				
	    	} catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    
	    	StringBuffer sb = new StringBuffer(NAVER_OPEN_URL);
	    	sb.append("?key=").append(SEARCH_KEY).append("&query=").append(keyword)
	    	  .append("&display=10&start=1&target=movie");
	    	
	    	HttpGet httpget = new HttpGet(sb.toString());
	        System.out.println("Executing request " + httpget.getRequestLine());

	        // Create a custom response handler
	        ResponseHandler<String> responseHandler = new ResponseHandler<String>() {

	            @Override
	            public String handleResponse(
	                    final HttpResponse response) throws ClientProtocolException, IOException {
	                int status = response.getStatusLine().getStatusCode();
	                if (status >= 200 && status < 300) {
	                    HttpEntity entity = response.getEntity();
	                    return entity != null ? EntityUtils.toString(entity) : null;
	                } else {
	                    throw new ClientProtocolException("Unexpected response status: " + status);
	                }
	            }

	        };
	        
	        String responseBody = httpclient.execute(httpget, responseHandler);
	        System.out.println("----------------------------------------");
	        System.out.println(responseBody);	        
	        
	        List<Movie> movieList = NaverMovieXMLParser.parse(responseBody);
	        
	        System.out.println(movieList);
	        
	        /********************************************************
	         * 검색된 순서대로 출력하기
	         * 1. 스타워즈 에피소드 8 - [오스카 아이삭, 베네치오 델 토로]
	         * 2. 스타 워즈 앤솔로지: 로그 원 - [펠리시티 존스, 벤 멘델슨, .. ]
	         * 3. 스타워즈: 깨어난 포스 - [해리슨 포드, 마크 해밀, 캐리 피셔, .. ]
	         ********************************************************/
	        
	        
	        
	        try(Writer w = new FileWriter("files/output1.txt");
	        		BufferedWriter bw = new BufferedWriter(w)) {
	        	
	        	int num = 1;
	        	for(Movie m : movieList) {
	        		System.out.print(num + ". " + m.getTitle() + " - [");
	        		for(String s : m.getActors()) {
	        			System.out.print(s + ", ");
	        		}
	        		System.out.println("]");
	        	}
	       
	        } catch(Exception e) {
	        	e.printStackTrace();
	        }
	        
	        
	    } catch (IOException e) {
	    	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
	        try {
				if(httpclient != null) httpclient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	}

}
