# ThoughtSpot React Demo App

This is a simple React demo application that demonstrates how to use the ThoughtSpot REST API SDK to interact with a ThoughtSpot instance. It includes a login feature and the ability to fetch and display a list of users from the ThoughtSpot instance.

## Prerequisites

Before you begin, make sure you have the following prerequisites:

- Node.js installed on your machine
- A ThoughtSpot instance accessible with the necessary credentials

## Getting Started

To get started with the ThoughtSpot React Demo App, follow these steps:

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/thoughtspot/rest-api-sdk.git
   ```

2. Install and build local sdk

   ```
   cd sdks/typescript
   npm i
   npm run build
   ```

3. Navigate to the project directory and install:

   ```
   cd demos/typescript/browser
   npm i
   ```

4. Open the src/App.tsx file and update the following constants with your ThoughtSpot server information:

   - BASE_URL: The URL of your ThoughtSpot instance.
   - USERNAME: Your ThoughtSpot username.
   - PASSWORD: Your ThoughtSpot password.

5. Start the application using:

   ```
   npm run start
   ```

## Using the Application

- Click the "Login" button to log in to your ThoughtSpot instance using the provided credentials. Click it again to log out.

- Click the "Get users" button to fetch a list of users from your ThoughtSpot instance and display their names on the page.
