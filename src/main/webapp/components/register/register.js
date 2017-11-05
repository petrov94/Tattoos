'user strict';

angular.module('myApp.register', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/register', {
        templateUrl: 'components/register/register.html',
        controller: 'RegisterCtrl'
    });
}])

.controller('RegisterCtrl', ['$scope', '$http', function($scope, $http) {
        /*$scope.bala = 'bala ala';*/
        $scope.success = false;
        /*$scope.submit = function() {
        var url = '#/register'
        $http.post(url, $scope.user).
                success(function(data, status, headers, config) {
                    // this callback will be called asynchronously
                    // when the response is available
                    $scope.success = true;
                }).
                error(function(data, status, headers, config) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });
        };
        */
        /*
        $scope.ala = function() {
            $scope.bala = 'ala bala';
        };*/
        /*
        $resource('/api/files/556f2bbb3d4bdd7c2775103a').get().$promise.then(function(file) {
            $scope.file = file.name;
        });*/
}]);
