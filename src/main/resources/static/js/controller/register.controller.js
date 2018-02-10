function registerController($scope, registerService) {
	
	$scope.user = {};
	
	$scope.register = function () {
		registerService.registerUser($scope.user);
	}
}
