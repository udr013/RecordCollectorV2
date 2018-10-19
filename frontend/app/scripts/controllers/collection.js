'use strict';

/**
 * @ngdoc function
 * @name frontendApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the frontendAp
 */
angular.module('app')
    .factory('recordFactory', recordFactory)
  .controller('CollectionCtrl', function ($scope) {
      // $scope.albums = [
      //     {'artist':'Jimi Hendrixx', 'title':'Electric Ladyland', 'year':'1969'}
      // ];
      $scope.getAlbums = function () {
          recordFactory.getRecords().succes(function (records) {


          })
      }
  });
