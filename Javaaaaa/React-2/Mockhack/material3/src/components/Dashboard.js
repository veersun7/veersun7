import React from "react";

function Dashboard({ userData }) {
  return (
    <div>
      <h2>Welcome, {userData.username}!</h2>
      {/* Add other dashboard content here */}
    </div>
  );
}

export default Dashboard;