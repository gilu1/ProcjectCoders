var app = angular.module('front-end', [ 'ui.router' ]);

app.config(configFunction);
app.controller("registerCtrl", registerController);
app.controller("loginCtrl", loginController);

app.controller('FirstCtrl', [ '$scope', function($scope) {
	$scope.message = "świecie";
} ]);

function configFunction ($stateProvider) {
    $stateProvider
        .state('register',{
            views: {
                'mainView': {
                    templateUrl: '/partial/register-template.html',
                    controller: 'registerCtrl'
                }
            }
        })
        .state('login',{
                views: {
                    'loginView': {
                        templateUrl: '/partial/login.html',
                        controller: 'loginCtrl'
                    },
                    
                }
            })
}

