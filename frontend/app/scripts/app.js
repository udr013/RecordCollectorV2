'use strict';

/**
 * @ngdoc overview
 * @name frontendApp
 * @description
 * # frontendApp
 *
 * Main module of the application.
 */
angular
    .module('app', [
        'ngAnimate',
        'ngRoute',
        'ngTouch'
    ])
    .config(function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'views/home.html',
                controller: 'HomeCtrl',
                // controllerAs: 'home'
            })
            .when('/blog', {
                templateUrl: 'views/blog.html',
                // controller: 'BlogCtrl',
                // controllerAs: 'home'
            })
            .when('/collection', {
                templateUrl: 'views/collection.html',
                controller: 'CollectionCtrl',
                // controllerAs: 'collection'
            })
            .when('/about', {
                templateUrl: 'views/about.html',
                controller: 'AboutCtrl',
                // controllerAs: 'about'
            })
            .when('/contact', {
                templateUrl: 'views/contact.html',
                controller: 'ContractCtrl',
                // controllerAs: 'contact'
            })

            .otherwise({
                redirectTo: '/'
            });
    })
    //this fixes the url to "baseUrl/#/"
    .config(['$locationProvider', function($locationProvider) {
        $locationProvider.hashPrefix('');
    }]);

