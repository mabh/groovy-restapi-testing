/*
* Copyright (c) 2013-2015 Software AG, Darmstadt, Germany 
* and/or Software AG USA Inc., Reston, VA, USA, and/or 
* its subsidiaries and or/its affiliates and/or their 
* licensors.
* Use, reproduction, transfer, publication or disclosure 
* is prohibited except as specifically provided for in your 
* License Agreement with Software AG.
*/

package rest

import org.testng.Assert
import org.testng.annotations.Test
import groovyx.net.http.*
import static groovyx.net.http.ContentType.*

class RestTest {

	@Test	
	def resttest() {
		def client = new RESTClient('http://www.leveluplunch.com')
		def resp = client.get ( 
						path: '/groovy/examples/',
					)
		Assert.assertEquals(resp.status, 200)
	}
}
