package com.example.Demo2.interceptor;
import com.example.Demo2.config.WebConfig;
import com.example.Demo2.config.JwtConfig;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class TokenInterceptor extends HandlerInterceptorAdapter {
	@Resource
	private JwtConfig jwtConfig ;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		String uri = request.getRequestURI() ;

		if( uri.toLowerCase().contains("/helloworld") 
			|| uri.toLowerCase().contains("/getaddrecord") 
			|| uri.toLowerCase().contains("/getbalance") 
			|| uri.toLowerCase().contains("/getsvalue") 
			|| uri.toLowerCase().contains("/updatebalance")
			|| uri.toLowerCase().contains(".html")
			|| uri.toLowerCase().contains(".htm") 
			|| uri.toLowerCase().contains(".js") 
			|| uri.toLowerCase().contains(".css") 
			|| uri.toLowerCase().contains(".png") 
			|| uri.toLowerCase().contains(".jpeg") 
			|| uri.toLowerCase().contains(".jpg") 
			|| uri.toLowerCase().contains("/pay")
			|| uri.toLowerCase().contains(".") ){
			return true;
		}

//		String token = request.getHeader(jwtConfig.getHeader());
//		if(StringUtils.isEmpty(token)){
//			token = request.getParameter(jwtConfig.getHeader());
//		}
//
//		if(StringUtils.isEmpty(token)){
//			throw new Exception(jwtConfig.getHeader()+ " can't be empty.");
//		}

	//	Claims claims = jwtConfig.getTokenClaim(token);

//		if(claims == null || jwtConfig.isTokenExpired(claims.getExpiration())){
//			throw new Exception(jwtConfig.getHeader() + "Invalid, Please login again");
//		}
//
//		WebConfig.addUserContext(claims.getSubject());

		return true;
	}

}