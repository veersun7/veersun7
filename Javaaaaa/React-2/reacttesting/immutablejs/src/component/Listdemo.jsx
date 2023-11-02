import React, { useState } from "react";
const { List } = require("immutable");

function Listdemo() {
  const list = List(["ram", "kumar", "sachin", "peter", "prijoy"]);
  const [name, setName] = useState();
  const [index, setIndex] = useState();

  const displaylist = () => {
    setName(list.get(index));
    console.log(list.first());
    console.log(list.last());
    list.forEach((x) => {
      console.log(x);
    });
  };
  return (
    <div>
      <div>
        <form>
          <label>Index No:</label>
          <input
            type="text"
            onBlur={(e) => {
              setIndex(e.target.value);
            }}
          ></input>
        </form>
        <button type="button" onClick={displaylist}>
          Click
        </button>
      </div>
      {name}
    </div>
  );
}

export default Listdemo;