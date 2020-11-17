package com.danilodughetti.domainchecker.utils;

public class ApplicationConstants {

	public static class WhoIs {
		private WhoIs() {}

		public static class QueryParameters {
			private QueryParameters() {}
			public static final String DOMAIN = "domain";
		}
		
		public static class HeaderKey {
			private HeaderKey() {}
			public static final String APIKEY = "apikey";
		}
	}
}
