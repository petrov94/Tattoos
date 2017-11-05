/**
 * Created by milen on 22/07/15.
 */
angular.module('myApp.profile', ['ngRoute'])
.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/artists/:name', {
        templateUrl: 'components/profile/profile.html',
        controller: 'ProfileCtrl'
    });
}])

.controller('ProfileCtrl', ['$scope', '$location', '$http', function($scope, $location, $http){
    var url = $location.path();
    $http.get(url).success(function (data) {
    	$scope.artist = data;
    });
	
	/*$scope.artist = {
        'artist_id': 1,
        'name': 'Rosen Tashkov',
        'rating': '8.0',
        'studio': 'Shoots',
        'address': 'Sofia, 104-B Zaichar str.',
        'phone': '0888 710 886',
        'website': 'https://tattoostudio.bg',
        'coverImg': 'http://www.prettydesigns.com/wp-content/uploads/2013/11/Cool-Tattoos.jpg',
        'avatarImg': 'https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSRwCH5drgewVLZMLYHPJSW7qOaitY_CcnldraEa9mcqrjLNoGV'
    };

    $scope.tattoos = [
        {
            'img': 'tattoo-images/tattoo1.jpg',
            'artist_id': 1
        },
        {
            'img': 'http://24.media.tumblr.com/tumblr_md4prdP5aM1rbmrzho1_500.jpg',
            'artist_id': 1
        },
        {
            'img': 'https://s-media-cache-ak0.pinimg.com/736x/05/ec/41/05ec41544f1450333d430ceb0eafd4de.jpg',
            'artist_id': 1
        }
    ];*/
}]);

