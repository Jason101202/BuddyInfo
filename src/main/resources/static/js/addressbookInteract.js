$(document).ready(function() {
    const apiUrl = "https://personalizedaddressbook-eebqcue0bhayaeft.canadacentral-01.azurewebsites.net/api/addressBook";


    $.ajax({
        url: apiUrl,
        type: 'GET',
        success: function(data) {
            if (data && data.name) {
                console.log("Fetched data:", data);
                $('.addressbook-name').text("Your address book: " + data.name);
            } else {
                $('.addressbook-name').text("No address book exists yet. Create one below!");
            }
        },
        error: function(xhr) {
            console.error("Error fetching Address Book:", xhr.status, xhr.statusText);
        }
    });


    $("#addressbook-form").on("submit", function(event) {
        event.preventDefault();


        const name = $("#addressbook-name").val();

        $.ajax({
            url: apiUrl,
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({ name: name }),
            success: function(data) {
                console.log("Fetched data:", data);
                $('.addressbook-name').text("Your address book: " + data.name);
            },
            error: function(xhr) {
                console.error("Error creating Address Book:", xhr.status, xhr.statusText);
            }
        });
    });
});
