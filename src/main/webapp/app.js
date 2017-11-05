'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'ngResource',
  'myApp.home',
  'myApp.tattoos',
  'myApp.artists',
  'myApp.signin',
  'myApp.register',
  'myApp.profile'
]).
config(['$routeProvider', function($routeProvider) {
  $routeProvider.otherwise({redirectTo: '/home'});
}]);
