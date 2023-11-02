import { render, screen } from "@testing-library/react";
import App from "./App";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import HomePage from "./components/HomePage";

// test('renders learn react link', () => {
//   render(<App />);
//   const linkElement = screen.getByText(/learn react/i);
//   expect(linkElement).toBeInTheDocument();
// });

test("test", () => {
  expect(true).toBe(true);
});

test("find footerunit in homepage", () => {
  // act(() => {
  render(
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<HomePage />} />
      </Routes>
    </BrowserRouter>
  );
  // });
  const todoElement = screen.getByTestId("footerunit");
  expect(todoElement).toBeInTheDocument();
});

test("finding listName in footer", () => {
  render(
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<HomePage />} />
      </Routes>
    </BrowserRouter>
  );
  const listName = screen.getByTestId("footerunit");
  expect(listName).toBeInTheDocument();
  expect(listName).toHaveTextContent("© Natwest Group 2023");
  expect(listName).toHaveTextContent("Leadership & governance");
  expect(listName).toHaveTextContent("Quick links");
});
