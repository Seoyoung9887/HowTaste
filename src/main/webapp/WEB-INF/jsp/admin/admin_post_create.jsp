<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
    <div class="d-flex justify-content-center">
     <div>
       <span class="">상호명</span>
		<div class="m-1">
		   <input type="text" id="name" class="form-control ">				
		</div>								
		<span class="">주소</span>
		<div class="m-1">
		   <input type="text" id="address" class="form-control">				
		</div>	
		<span class="">전화번호</span>
		<div class="m-1">
		   <input type="text" id="number" class="form-control ">				
		</div>
		<span class="">음식종류</span>
		<div class="m-1">
		   <input type="text" id="kind" class="form-control ">				
		</div>								
		<span class="">가격대</span>
		<div class="m-1">
		   <input type="text" id="price" class="form-control ">				
		</div>								
		<span class="">주차</span>
		<div class="m-1">
		   <input type="text" id="park" class="form-control ">				
		</div>								
		<span class="">영업시간</span>
		<div class="m-1">
		   <input type="text" id="businessHours" class="form-control ">				
		</div>								
		<span class="">마지막주문</span>
		<div class="m-1">
		   <input type="text" id="lastOder" class="form-control ">				
		</div>								
		<span class="">휴일</span>
		<div class="m-1">
		   <input type="text" id="closingDay" class="form-control ">				
		</div>								
		<span class="">대표매뉴</span>
		<div class="m-1">
		   <input type="text" id="delegateMenu" class="form-control ">				
		</div>								
		<span class="">사진</span>
		<div class="d-flex m-1">
		   <input type="file" id="file" class="d-none" accept=".gif,.jpg,.png,.jpeg">
		   <a href="#" id="fileUploadBtn">
			<img src="https://cdn-icons-png.flaticon.com/128/54/54975.png" alt="파일선택" width="35">
			</a>
			<div id="fileName" class="ml-2"></div>				
					
		</div>
		<button type="button" id="writeBtn" class="btn btn-info">등록</button>
	  </div> 																										
    </div>
    <script>
    $(document).ready(function(){
    	$('#fileUploadBtn').on('click',function(e){
    		e.preventDefault(); 
    		$('#file').click(); 
    	});
    	$('#file').on('change',function(e){
    		let fileName = e.target.files[0].name;
    		let arr = fileName.split(".");
    		if (arr.length < 2 ||
    				(arr[arr.length - 1] != 'gif'
    						&& arr[arr.length - 1] != 'jpeg'
    							&& arr[arr.length - 1] != 'jpg'
    								&& arr[arr.length - 1] != 'png')) {
    			alert("이미지 파일만 업로드 할 수 있습니다.");
    			$(this).val("");
    			$('#fileName').text("");
    			return;
    		}	
    		$('#fileName').text(fileName);
    	});
    	$('#writeBtn').on('click',function(){
    		let name = $('#name').val();
    		if(name.length < 1){
    			alert("상호명을 적어주세요");
    		}
    		let address = $('#address').val();
    		if(address.length < 1){
    			alert("주소를 적어주세요");
    		}    		
    		let number = $('#number').val();
    		if(number.length < 1){
    			alert("전화번호를 적어주세요");
    		}
    		let kind = $('#kind').val();
    		if(kind.length < 1){
    			alert("음식종류를 적어주세요");
    		}
    		let price = $('#price').val();
    		if(price.length < 1){
    			alert("가격을 적어주세요");
    		}
    		let park = $('#park').val();
    		if(park.length < 1){
    			alert("주차를 적어주세요");
    		}
    		let businessHours = $('#businessHours').val();
    		if(businessHours.length < 1){
    			alert("영업시간을 적어주세요");
    		}
    		let lastOder = $('#lastOder').val();
    		if(lastOder.length < 1){
    			alert("마지막 주문을 적어주세요");
    		}
    		let closingDay = $('#closingDay').val();
    		if(closingDay.length < 1){
    			alert("휴일을 적어주세요");
    		}
    		let delegateMenu = $('#delegateMenu').val();
    		if(name.length < 1){
    			alert("대표매뉴를 적어주세요");
    		}
    		let file = $('#file').val();
    		if (file != '') {
    			let ext = file.split('.').pop().toLowerCase();
    			
    			if ($.inArray(ext, ['gif', 'png', 'jpg', 'jpeg']) == -1) {
    				alert("gif, png, jpg, jpeg 파일만 업로드 할 수 있습니다.");
    				$('#file').val(''); 
    				return;
    			}
    		}
    		let formData = new FormData();
    		formData.append("name", name);
    		formData.append("address", address);
    		formData.append("number", number);
    		formData.append("kind", kind);
    		formData.append("price", price);
    		formData.append("park", park);
    		formData.append("businessHours", businessHours);
    		formData.append("lastOder", lastOder);
    		formData.append("closingDay", closingDay);
    		formData.append("delegateMenu", delegateMenu);
    		formData.append("file", $('#file')[0].files[0]); 
    		
    		
    		$.ajax({
    			type: "post"
    			, url: "/admin/post/create"
    			, data: formData
    			, enctype: "multipart/form-data"    // 파일 업로드를 위한 필수 설정
    			, processData: false    // 파일 업로드를 위한 필수 설정
    			, contentType: false    // 파일 업로드를 위한 필수 설정
    			, success: function(data) {
    				if (data.result == "success") {
    					location.reload();
    				} else {
    					alert(data.errorMessage);
    				}
    			}
    			, error: function(e) {
    				alert("메모 저장에 실패했습니다. 관리자에게 문의해주세요.");
    			}
    		});
    	});
    });
    
    </script>