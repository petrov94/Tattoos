'use strict';

angular.module('myApp.tattoos', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/tattoos', {
    templateUrl: 'components/tattoos/tattoos.html',
    controller: 'TattoosCtrl'
  });

}])

.controller('TattoosCtrl', ['$scope', '$http', function($scope, $http) {
      /*$scope.tattoos = [
        {
            'artist_id': 1,
            'artist': 'Rosen Tashkov',
            'img': 'tattoo-images/tattoo1.jpg'

        },
        {
            'artist_id': 2,
            'artist': 'Scott Campbell',
            'img': 'tattoo-images/tattoo2.jpg'
        },
        {
            'artist_id': 3,
            'artist': 'Don Ed Hardy',
            'img': 'tattoo-images/tattoo3.jpg'
        },
        {
            'artist_id': 1,
            'artist': 'Rosen Tashkov',
            'img': 'https://s-media-cache-ak0.pinimg.com/736x/05/ec/41/05ec41544f1450333d430ceb0eafd4de.jpg'
        },
        {
            'artist_id': 1,
            'artist': 'Rosen Tashkov',
            'img': 'http://24.media.tumblr.com/tumblr_md4prdP5aM1rbmrzho1_500.jpg'
        },
        {
            'artist_id': 1,
            'artist': 'Don Ed Hardy',
            'img': 'http://www.coupletattoo.com/wp-content/uploads/2015/03/half-sleeve-tattoos-ideas-for-men.jpg'
        }
      ];*/

        $http.get('/tattoos').
        success(function(data, status, headers, config) {
            // this callback will be called asynchronously
            // when the response is available
            $scope.tattoos = data;
        }).
        error(function(data, status, headers, config) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
        });

}]);