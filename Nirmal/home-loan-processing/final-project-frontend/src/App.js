import { useSelector } from "react-redux";
import { Route, Routes } from "react-router-dom";
import "./App.css";
import Dashboard from "./components/Dashboard";
import HomePage from "./components/HomePage";
import LoginPage from "./components/LoginPage";
import SignUpPage from "./components/SignUpPage";
import Apply from "./pages/Apply";
import Profile from "./pages/Profile";
import Emicalculator from "./pages/Emicalculator";
import Status from "./pages/Status";
import Eligibility from "./pages/Eligibility";
import { ContactForm } from "./pages/ContactForm";

function App() {
  const user = useSelector((state) => state.user.value);
  var loginStatusValidation = user.loginStatus;
  console.log(loginStatusValidation);
  return (
    <div>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/signup" element={<SignUpPage />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/apply" element={<Apply />} />
        <Route path="/eligibility" element={<Eligibility />} />s
        <Route path="/profile" element={<Profile />} />
        <Route path="/emicalculator" element={<Emicalculator />} />
        <Route path="/status" element={<Status />} />
        <Route path="/loan" element={<ContactForm />} />
      </Routes>
    </div>
  );
}

export default App;
