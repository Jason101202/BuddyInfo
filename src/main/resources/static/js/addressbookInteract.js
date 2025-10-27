$(document).ready(function() {
    $("#create").on("click", function() {
        $.ajax({
            url: "https://personalizedaddressbook-eebqcue0bhayaeft.canadacentral-01.azurewebsites.net/addressBook",
            type: 'POST',
            contentType: 'application/json',
            data: { name: $("#name").val()},
            success: function(response) {
                $('.addressbook-name').append($("#name").val());
            }
        });
    });
});