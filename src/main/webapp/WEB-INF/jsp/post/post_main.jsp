<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <div>
       <div>
         <div class="d-flex justify-content-center m-4 font-weight-bold"><h2>모든 맛집이 여기에</h2></div>
         <div class="d-flex justify-content-center m-2 font-weight-bold"><h2>맛집어때?</h2></div>
       </div>
       <c:forEach items="${postList}" var="post">
       <div class="d-flex justify-content-center">
           <img class="mainimg" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTExMjlfMTY4%2FMDAxNjM4MTUyMzgwMDc0.ouQvfNVlMXcsjNGEa7Y9KfzNVbP3ArXOPWYO7EdnyhQg.CQmrSu8bTFjqMi6khKlArjSogIDzxyhtsDdLxJHUoTwg.JPEG.nheroz%2FKakaoTalk_20210830_015935904_10.jpg&type=sc960_832" class="w-50" alt="이미지">
           <div class="">
               <div class="d-flex maincontent">
                   <div class="col-6"><a href="/post/post_detail_view?postId=${post.id}">${post.name}</a></div>
                   <div class="col-6">평점:</div>
                   
               </div>
               <div class="maincontent2 ml-3">서울</div>
               <div class="ml-3">안녕하세요</div>
           </div> 
           <div class="">좋아요</div>          
       </div>
       </c:forEach>
    </div>