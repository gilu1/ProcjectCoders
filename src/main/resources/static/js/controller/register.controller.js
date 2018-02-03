function registerController($scope) {
	$scope.user = {};
	
	$scope.register = function () {
		console.log($scope.user);
	}
}