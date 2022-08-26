package com.bookstore.demo.actuator;


	import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
	import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
	import org.springframework.boot.actuate.endpoint.annotation.Selector;
	import org.springframework.stereotype.Component;

	@Component
	@Endpoint(id="release-notes")
	public class Releasenotes {

		String version10 = "** Version 1.0 ** \n\n"
				+ "* Home page created\n"
				+ "* Adding a new book form added\n"
				
				;
		
		String version11 = "** Version 1.1 \n\n"
				+ "* Creating customer\n"
				+ "* enable ordering fucntionality \n";
		
		@ReadOperation
		public String releaseNotes() {
			return version11 + version10;
		}
		
	
	
}
