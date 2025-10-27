$(document).ready(function() {
    $ajax({
        url: "https://personalizedaddressbook-eebqcue0bhayaeft.canadacentral-01.azurewebsites.net/addressBook"
    }).then(function(data) {
        $('.addressbook-name').append(data.name);

    })


})