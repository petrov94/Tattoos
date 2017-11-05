'user strict';

angular.module('myApp.signin', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/signin', {
        templateUrl: 'components/signin/signin.html',
        controller: 'SigninCtrl'
    });
}])

.controller('SigninCtrl', [function() {

}]);
