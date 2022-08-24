<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
   <div class="d-flex justify-content-center">
      <img src="/img/1.jpg">
      <img src="/img/2.jpg">
      <img src="/img/3.jpg">
      <img src="/img/4.jpg">
      <img src="/img/5.jpg">
   </div>
   <div class="d-flex justify-content-center">
     <div>
	      <div class="d-flex">
	         <div class="d-flex">
	            <div>${post.name}</div>
	            <div>평점</div>
	         </div>
	         <div><button >리뷰쓰기</button></div>
	         <div>좋아요</div>
	      </div>
	      <div>
	         <div>
	            <div>주소: ${post.address}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>전화번호: ${post.number}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>음식종류: ${post.kind}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>가격대: ${post.price}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>주차: ${post.park}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>영업시간: ${post.businessHours}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>마지막주문: ${post.lastOder}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>휴일: ${post.closingDay}</div>
	            <div></div>
	         </div>
	         <div>
	            <div>대표음식: ${post.delegateMenu}</div>
	            <div></div>
	         </div>
	      </div>
	      <div>
	      리뷰
	        <div class="d-flex">
	          <div>별명</div>
	          <div>
	             <div>등록일</div>
	             <div>리뷰내용</div>
	          </div>
	          <div>평점</div>
	          <div>삭제</div>
	        </div>
	      
	      </div>
	   </div>   
   </div>

</div>