'use strict';

angular.module('myApp.artists', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/artists', {
        templateUrl: 'components/artists/artists.html',
        controller: 'ArtistsCtrl'
    });
}])

.controller('ArtistsCtrl', ['$scope', '$http', function($scope, $http) {



    /*$scope.artists = [
        {
            'id': 1,
            'name': 'Rosen Tashkov',
            'studio': 'Shoots',
            'address': 'Sofia, 104-B Zaichar str.',
            'avatarImg': 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSRwCH5drgewVLZMLYHPJSW7qOaitY_CcnldraEa9mcqrjLNoGV',
            'rating': '8.0'
        },
        {
            'id': 2,
            'name': 'Scott Campbell',
            'studio': 'New York Ink',
            'address': 'New York, 123 Manhattan',
            'avatarImg': 'http://1.bp.blogspot.com/-7kfJ9YV40f8/UghzBsjmjjI/AAAAAAAAMh0/WBAxrOEC4Qw/s640/Tattoos-Tumblr-38.jpg',
            'rating': '7.0'
        },
        {
            'id': 3,
            'name': 'Don Ed Hardy',
            'studio': 'Las Vegas Tattoo Kings',
            'address': 'Las Vegas, The Mirage',
            'avatarImg': 'http://1.bp.blogspot.com/-7kfJ9YV40f8/UghzBsjmjjI/AAAAAAAAMh0/WBAxrOEC4Qw/s640/Tattoos-Tumblr-38.jpg',
            'rating': '6.9'
        }
    ];*/

    $http.get('/artists').success(function (data) {
        $scope.artists = data;
    });

}]);