'use strict';


var App = angular.module('example', []);

App.controller('PhoneController', function ($scope, $http) {
    
  $http.get('contact').success(function (data) {
    $scope.contacts = data;
  });

  $scope.addContact = function () {
    $http.post('contact', $scope.contact).success(function (data) {
      $scope.contacts = data;
      $scope.contact = {};
    });
  };

  $scope.remove = function (contact) {
    $http.delete('contact', {params: {contactId: contact.id}}).success(function (data) {
      $scope.contacts = data;
    });
  };

});