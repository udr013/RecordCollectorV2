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
      $scope.getAlbums = function () {
          recordFactory.getRecords().succes(function (records) {


          })
      }
  });
