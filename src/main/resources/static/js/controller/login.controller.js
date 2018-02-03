function loginController($scope) {
	$scope.user = {};
	
	$scope.login = function () {
		console.log($scope.user);
	}
}