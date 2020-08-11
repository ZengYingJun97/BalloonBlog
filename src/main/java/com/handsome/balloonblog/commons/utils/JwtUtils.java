package com.handsome.balloonblog.commons.utils;


import com.handsome.balloonblog.commons.result.CheckResult;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Date;

/**
 * @program: balloonblog
 * @description: 签发JWT工具类
 * @author: handsome
 * @create: 2020-08-05 23:12
 **/
public class JwtUtils {

    public static String createJWT(String id, String subject, long ttlMillis) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS384;
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        SecretKey secretKey = generalKey();
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId(id)
                .setSubject(subject)
                .setIssuer("handsome")
                .setIssuedAt(now)
                .signWith(signatureAlgorithm, secretKey);
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis;
            Date expDate= new Date(expMillis);
            jwtBuilder.setExpiration(expDate);
        }
        return jwtBuilder.compact();
    }

    public static CheckResult validateJWT(String jwtStr) {
        CheckResult checkResult = new CheckResult();
        Claims claims = null;
        try {
            claims = parseJWT(jwtStr);
            checkResult.setSuccess(true);
            checkResult.setClaims(claims);
        } catch (Exception e) {
            checkResult.setErrCode(0);
            checkResult.setSuccess(false);
        }
        return checkResult;
    }

    public static SecretKey generalKey() {
        byte[] encodeKey = Base64.decode("haudhgfuiawhgwirhgqajbahfqASFAEG");
        SecretKey secretKey = new SecretKeySpec(encodeKey, 0, encodeKey.length, "AES");
        return secretKey;
    }

    public static Claims parseJWT(String jwt) throws Exception {
        SecretKey secretKey = generalKey();
        return Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(jwt)
                .getBody();
    }
}
