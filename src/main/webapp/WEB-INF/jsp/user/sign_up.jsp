<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	<div class="d-flex justify-content-center">
		<div class="sign-up-box">
			<h1 class="m-4 font-weight-bold">회원가입</h1>
			<form id="signUpForm" method="post" action="/user/sign_up">
				<span class="sign-up-subject">ID</span>
				<div class="d-flex ml-3 mt-3">
					<input type="text" name="loginId" class="form-control col-6"
						placeholder="ID를 입력해주세요">
					<button type="button" id="loginIdCheckBtn" class="btn btn-success">중복확인</button>
				</div>

				<%-- 아이디 체크 결과 --%>
				<div class="ml-3 mb-3">
					<div id="idCheckLength" class="small text-danger d-none">ID를
						4자 이상 입력해주세요.</div>
					<div id="idCheckDuplicated" class="small text-danger d-none">이미
						사용중인 ID입니다.</div>
					<div id="idCheckOk" class="small text-success d-none">사용 가능한
						ID 입니다.</div>
				</div>

				<span class="sign-up-subject">비밀번호</span>
				<div class="m-3">
					<input type="password" name="password" class="form-control col-6"
						placeholder="비밀번호를 입력하세요">
				</div>

				<span class="sign-up-subject">비밀번호 확인</span>
				<div class="m-3">
					<input type="password" name="confirmPassword"
						class="form-control col-6" placeholder="비밀번호를 입력하세요">
				</div>

				<span class="sign-up-subject">별명</span>
				<div class="m-3">
					<input type="text" name="nickName" class="form-control col-6"
						placeholder="별명을 입력하세요">
				</div>

				<span class="sign-up-subject">이메일</span>
				<div class="m-3">
					<input type="text" name="email" class="form-control col-6"
						placeholder="이메일을 입력하세요">
				</div>
				<span class="sign-up-subject">전화번호</span>
				<div class="m-3">
					<input type="text" name="phoneNumber" class="form-control col-6"
						placeholder="전화번호를 입력하세요">
				</div>

				<br>
				<div class="d-flex justify-content-center m-3">
					<button type="button" id="signUpBtn" class="btn btn-info">가입하기</button>
				</div>
			</form>
		</div>
	</div>
<script>
$(document).ready(function() {
	// 아이디 중복 확인
	$('#loginIdCheckBtn').on('click', function(e) {
		// validation
		var loginId = $('input[name=loginId]').val().trim();
		if (loginId.length < 4) {
			$('#idCheckLength').removeClass('d-none'); // 경고문구 노출
			$('#idCheckDuplicated').addClass('d-none'); // 숨김
			$('#idCheckOk').addClass('d-none'); // 숨김
			return;
		}
		
	
		$.ajax({
			url: "/user/is_duplicated_id",
			data: {"loginId": loginId},
			success: function(data) {
				if (data.result == true) { // 중복인 경우
					$('#idCheckDuplicated').removeClass('d-none'); // 중복 경고문구 노출
					$('#idCheckLength').addClass('d-none'); // 숨김
					$('#idCheckOk').addClass('d-none'); // 숨김
				} else {
					$('#idCheckOk').removeClass('d-none'); // 사용가능 문구 노출
					$('#idCheckLength').addClass('d-none'); // 숨김
					$('#idCheckDuplicated').addClass('d-none'); // 숨김
				}
			},
			error: function(error) {
				alert("아이디 중복확인에 실패했습니다. 관리자에게 문의해주세요.");
			}
		});
	});
	
	
	$('#signUpBtn').on('click', function(e) {
		e.preventDefault(); // 클릭 이벤트의 기본 동작을 중단
		
		// validation
		var loginId = $('input[name=loginId]').val().trim();
		if (loginId == '') {
			alert("아이디를 입력하세요.");
			return;
		}
		
		var password = $('input[name=password]').val().trim();
		var confirmPassword = $('input[name=confirmPassword]').val().trim();
		if (password == '' || confirmPassword == '') {
			alert("비밀번호를 입력하세요.");
			return;
		}
		
		// 비밀번호 확인 일치 여부
		if (password != confirmPassword) {
			alert("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
			$('#password').val('');
			$('#confirmPassword').val('');
			return;
		}
		
		var nickName = $('input[name=nickName]').val().trim();
		if (nickName == '') {
			alert("이름을 입력하세요.");
			return;
		}
		var email = $('input[name=email]').val().trim();
		if (email == '') {
			alert("이메일 주소를 입력하세요.");
			return;
		}
		var phoneNumber = $('input[name=phoneNumber]').val().trim();
		if (phoneNumber == '') {
			alert("전화번호를 입력하세요.");
			return;
		}
		
		// 아이디 중복확인이 완료되었는지 확인
		if ($('#idCheckOk').hasClass('d-none') == true) {
			alert("아이디 확인을 다시 해주세요.");
			return;
		}
		
		
		
		var url = $('#signUpForm').attr("action");   
		var data = $('#signUpForm').serialize(); 
		
		$.post(url, data)
		.done(function(data) {
			if (data.result == "success") {
				alert("가입을 환영합니다!!! 로그인을 해주세요.");				
				location.href="/user/sign_in_view";
			} else {
				alert("가입에 실패했습니다. 다시 시도해주세요.");
			}
		}); 
	});
});
</script>

