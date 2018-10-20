'use strict';

/**
 * @ngdoc function
 * @name frontendApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontendApp
 */
angular.module('app')
  .controller('CollectionCtrl', function ($scope) {
      $scope.albums = [
          {'artist':'Jimi Hendrix', 'title':'Electric Ladyland', 'year':'1969'}
      ];
  });
