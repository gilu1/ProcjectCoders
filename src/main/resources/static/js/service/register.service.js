function registerService($http){
	return{
		registerUser: function(user){
			return $http.post("/api/user/register", user)
		}
	}
}