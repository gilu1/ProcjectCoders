var app = angular.module('userBody', [ 'ui.router' ]);

app.config(configFunction);
app.controller("taskCtrl",taskCtrl)

function configFunction($stateProvider) {
	$stateProvider
		.state('doTask'{
			views:{
				'result':{
					templateUrl: '/partial/register-template.html',
					controller: 'registerCtrl'
				}
			}
			
			
		})
}