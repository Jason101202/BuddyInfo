$(document).ready(function() {
    const apiUrl = "https://personalizedaddressbook-eebqcue0bhayaeft.canadacentral-01.azurewebsites.net/addressBook";

    function loadAddressBooks() {
            $.ajax({
                url: apiUrl,
                type: "GET",
                success: function(data) {
                    const list = $(".addressbook-list");
                    list.empty();
                    data.forEach(function(book) {
                        list.append(`<li>${book.name}</li>`);
                    });
                },
                error: function(xhr, status, error) {
                    console.error("Error fetching address books:", error);
                }
            });
        }

        loadAddressBooks();

    $("#create").on("click", function() {
        $.ajax({
            url: apiUrl,
            type: 'POST',
            contentType: 'application/json',
            data: { name: $("#name").val()},
            success: function(response) {
                $('.addressbook-name').append($("#name").val());
            }
        });
    });
});