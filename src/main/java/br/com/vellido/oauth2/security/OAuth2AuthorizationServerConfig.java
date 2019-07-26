package br.com.vellido.oauth2.security;


//@Configuration
//@EnableAuthorizationServer
//public class OAuth2AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    public AuthenticationManager authenticationManager;
//
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
//        tokenEnhancerChain.setTokenEnhancers(
//                Arrays.asList(tokenEnhancer(), accessTokenConverter()));
//
//        endpoints.tokenStore(tokenStore())
//                .accessTokenConverter(accessTokenConverter())
//                .authenticationManager(authenticationManager);
//    }
//
//    @Bean
//    public TokenStore tokenStore() {
//        return new JwtTokenStore(accessTokenConverter());
//    }
//
//    /*CHAVE PARA ASSINAR O TOKEN*/
//    @Bean
//    public JwtAccessTokenConverter accessTokenConverter() {
//
//        /*CHAVE ASSIMÉTRICA*/
//        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
//        KeyStoreKeyFactory keyStoreKeyFactory =
//                new KeyStoreKeyFactory(new ClassPathResource("mytest.jks"), "mypass".toCharArray());
//        converter.setKeyPair(keyStoreKeyFactory.getKeyPair("mytest"));
//        return converter;
//
//        /*CHAVE SIMÉTRICA*/
////        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
////        converter.setSigningKey("123");
////        return converter;
//    }
//
//    public Map<String, Object> getExtraInfo(Authentication auth) {
//        OAuth2AuthenticationDetails oauthDetails
//                = (OAuth2AuthenticationDetails) auth.getDetails();
//        return (Map<String, Object>) oauthDetails
//                .getDecodedDetails();
//    }
//
//    @Bean
//    @Primary
//    public DefaultTokenServices tokenServices() {
//        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
//        defaultTokenServices.setTokenStore(tokenStore());
//        defaultTokenServices.setSupportRefreshToken(true);
//        return defaultTokenServices;
//    }
//
//    @Bean
//    public TokenEnhancer tokenEnhancer() {
//        return new CustomTokenEnhancer();
//    }
//}
