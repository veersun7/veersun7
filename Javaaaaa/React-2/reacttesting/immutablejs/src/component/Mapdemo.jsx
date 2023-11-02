import React, { useState } from "react";
const { Map } = require("immutable");

function Mapdemo() {
  const [cityname, setCityname] = useState();
  const [population, setPopulation] = useState();
  const citypopulation = Map({
    chennai: 7500000,
    mumbai: 8700000,
    delhi: 6500000,
    bangalore: 7900000,
  });

  const getpopulation = () => {
    try {
      setPopulation(citypopulation.get(cityname));
      if (population === undefined) throw "city not loaded";
    } catch (err) {
      setPopulation(err);
      console.log("i am in catch block");
    }
  };

  return (
    <div>
      <div>
        <h1>Demo of City population using Maps</h1>
      </div>
      <div>
        <form>
          <label>Enter City Name</label>
          <input
            type="text"
            onBlur={(e) => {
              setCityname(e.target.value);
            }}
          ></input>
          <button type="button" onClick={getpopulation}>
            Click
          </button>
        </form>
        <div>{population}</div>
      </div>
    </div>
  );
}

export default Mapdemo;