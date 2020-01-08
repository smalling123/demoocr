package com.example.Demo2.config;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import java.util.Date;


@Component
public class JwtConfig {

	public String getToken (String identityId){
		Date nowDate = new Date();
		Date expireDate = new Date(nowDate.getTime() + expire * 1000);
		return Jwts.builder()
			.setHeaderParam("typ", "JWT")
			.setSubject(identityId)
			.setIssuedAt(nowDate)
			.setExpiration(expireDate)
			.signWith(SignatureAlgorithm.HS512, secret)
			.compact();
	}

	public Claims getTokenClaim (String token) {
		try {
			return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public boolean isTokenExpired (Date expirationTime) {
		return expirationTime.before(new Date());
	}

	private String secret = "PolarisCode";
	private long expire = 3600;
	private String header = "token";

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public long getExpire() {
		return expire;
	}

	public void setExpire(long expire) {
		this.expire = expire;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

}