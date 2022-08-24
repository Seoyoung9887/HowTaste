<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="d-flex justify-content-center">
  <div class=""> 
   <h1>상호명 에대한 리뷰를 작성해주세요</h1>
   <div class="d-flex">
      <div><input id="ck1" type="checkbox">매우좋다</div>
      <div><input id="ck2" type="checkbox">좋다</div>
      <div><input id="ck3" type="checkbox">별루다</div>
   </div>
   <div>
     <textarea id="content" class="form-control" placeholder="리뷰을 입력해주세요" rows="15" cols=""></textarea>
   </div>
   <div class="d-flex m-1">
		<input type="file" id="file" class="d-none" accept=".gif,.jpg,.png,.jpeg">
		<a href="#" id="fileUploadBtn">
		<img src="https://cdn-icons-png.flaticon.com/128/54/54975.png" alt="파일선택" width="35">
		</a>
	    <div id="fileName" class="ml-2"></div>			
    </div>
    <div class="d-flex justify-content-end">
      <button type="button" id="clearBtn" id="cancle" >취소</button>
      <button type="button" id="saveBtn" class="btn-light">작성완료</button>
    </div>
  </div> 
</div>

