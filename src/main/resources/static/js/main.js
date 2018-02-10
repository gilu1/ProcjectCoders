var app = angular.module('front-end', [ 'ui.router' ]);

app.config(configFunction);

app.service("loginService", loginService);
app.service("registerService", registerService);
app.controller("registerCtrl", registerController);
app.controller("loginCtrl", loginController);

app.controller('FirstCtrl', [ '$scope', function($scope) {
	$scope.message = "świecie";
} ]);


function configFunction ($stateProvider) {
    $stateProvider
        .state('register',{
            views: {
                'as': {
                    templateUrl: '/partial/register-template.html',
                    controller: 'registerCtrl'
                }
            }
        })
        .state('login',{
                views: {
                    'mainView': {
                        templateUrl: '/partial/login.html',
                        controller: 'loginCtrl'
                    },
                    
                }
            })
        .state('main',{
                views: {
                    'as': {
                        templateUrl: '/user.html',
                        controller: ''
                    },
                    
                }
            })    
        
}