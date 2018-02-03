var app = angular.module('front-end', ['ui.router']);


app.config(configFunction);
app.controller("registerCtrl", registerController);



app.controller('FirstCtrl', ['$scope', function($scope){
	$scope.message="świecie";
}]);



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
        .state('second-sample-view',{
                views: {
                    'frame2': {
                        templateUrl: '/partial/calculator-partial.html',
                        controller: 'mainCtrl'
                    },
                    'frame1': {
                        templateUrl: '/partial/text-replace-partial.html'
                    }
                }
            })
}