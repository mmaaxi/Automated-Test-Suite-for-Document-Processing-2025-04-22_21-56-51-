Feature: Validate file upload performance

  Scenario: Validate performance for small file uploads
    Given the user is on the file upload page
    When the user uploads a file of size 3 MB
    Then the upload and processing should complete in less than the specified time
    When the user uploads a file of size 6 MB
    Then the upload and processing should complete in less than the specified time
    When the user measures the response time for file preview
    Then the response time should be under 1 second for small files