package br.com.vellido.oauth2.security;


//public class CustomTokenEnhancer implements TokenEnhancer {
//
//    @Override
//    public OAuth2AccessToken enhance(
//            OAuth2AccessToken accessToken,
//            OAuth2Authentication authentication) {
//        Map<String, Object> additionalInfo = new HashMap<>();
//        additionalInfo.put(
//                "organization", authentication.getName() + "Lucas"/*randomAlphabetic(4)*/);
//        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(
//                additionalInfo);
//        return accessToken;
//    }
//}
