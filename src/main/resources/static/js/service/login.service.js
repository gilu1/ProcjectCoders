function loginService($http){
	return{
		loginUser: function(user){
			return $http.post("/api/user/login", user)
		}
	}
}