package myspringproject;

//@Configuration
//@RefreshScope
public class GetAccessConfig {
	/*@Value("${iassConfig.gaConfig.gaProperties.loginlocation}")
	String gaBaseUrl;
	@Value("${retrofit.connectionPool.maxIdleConnections}")
	int maxIdleConnections;
	@Value("${retrofit.connectionPool.keepAliveDuration}")
	int keepAliveDuration;
	@Value("${retrofit.httpClient.connectTimeout}")
	int connectTimeout;
	@Value("${retrofit.httpClient.readTimeout}")
	int readTimeout;

	@Autowired
	private IASSConfigProperties iassConfigProperties;

	@Bean
	public GetAccessAuthenticationService getAccessAuthenticationService() {
		return new GetAccessAuthenticationServiceImpl();
	} // need to figure out what these settings need to be.

	@Bean
	public ConnectionPool getConnectionPool() {
		return new ConnectionPool(maxIdleConnections, keepAliveDuration, TimeUnit.MILLISECONDS);
	}

	// create the okHttpClient and configure it.
	@Bean
	public OkHttpClient getOkHttpClient() {
		HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
		httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(connectTimeout, TimeUnit.MILLISECONDS)
				.readTimeout(readTimeout, TimeUnit.MILLISECONDS).connectionPool(getConnectionPool()).followRedirects(true)
				.addInterceptor(httpLoggingInterceptor).build();
		return client;
	} // build Retrofit client with appropriate decorators

	@Bean
	public Retrofit getAccessRetrofit() {

		return new Retrofit.Builder().baseUrl(gaBaseUrl).client(getOkHttpClient()).build();
	} // create MdtpOauthAPI retrofit service

	@Bean
	public GetAccessAuthAPI getAccessAuthAPI() {
		return getAccessRetrofit().create(GetAccessAuthAPI.class);

	}

	@Bean
	public GetAccessASIDao accessASIDao() {
		return new DefaultGetAccessASIDao(iassConfigProperties.getGaConfig());
	}

	@Bean
	public GetAccessHttpDao accessHttpDao() {

		return new DefaultGetAccessHttpDao(iassConfigProperties.getGaProperties(),getAccessAuthAPI());
	}*/

}