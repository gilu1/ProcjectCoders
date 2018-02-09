function loginController($scope, $state, loginService) {
	$scope.user = {};
	
	$scope.login = function () {
		loginService.loginUser($scope.user).then(function (){
			$state.go("main")
		});
	}
}