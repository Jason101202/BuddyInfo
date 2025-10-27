$(document).ready(function() {
    $("#create").on("click", function() {
        $.ajax({
            url: "https://personalizedaddressbook-eebqcue0bhayaeft.canadacentral-01.azurewebsites.net/addressBook",
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({ name: "Example Name" }),
        })
        .then(function(data) {
            $('.addressbook-name').append(data.name);
        })
        .catch(function(err) {
            console.error("Error:", err);
        });
    });
});