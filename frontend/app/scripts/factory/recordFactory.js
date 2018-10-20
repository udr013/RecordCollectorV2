function recordFactory($http){
    var factory = {};
    factory.getRecords = function() {
        return $http({
            method: 'GET',
            url: 'jimihendrix.json'
        })
    }
}