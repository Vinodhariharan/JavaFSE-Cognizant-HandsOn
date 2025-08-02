import React from 'react';

import ListofPlayers from './ListofPlayers';
import Scorebelow70 from './Scorebelow70';
import ListofIndianPlayers from './ListofIndianPlayers';

function OddPlayers({ players }) {

  const [first, , third, , fifth] = players;

  return (
    <div>
      <ul>
        <li>First: {first}</li>
        <li>Third: {third}</li>
        <li>Fifth: {fifth}</li>
      </ul>
    </div>
  );
}

function EvenPlayers({ players }) {
  const [, second, , fourth, , sixth] = players;

  return (
    <div>
      <ul>
        <li>Second: {second}</li>
        <li>Fourth: {fourth}</li>
        <li>Sixth: {sixth}</li>
      </ul>
    </div>
  );
}

function App() {
  const flag = false; 
  const players = [
    { name: 'Virat Kohli', score: 85 },
    { name: 'Rohit Sharma', score: 68 },
    { name: 'Sachin Tendulkar', score: 101 },
    { name: 'MS Dhoni', score: 45 },
    { name: 'Yuvraj Singh', score: 92 },
    { name: 'Jasprit Bumrah', score: 55 },
    { name: 'Hardik Pandya', score: 70 },
    { name: 'Rahul Dravid', score: 110 },
    { name: 'Ravindra Jadeja', score: 32 },
    { name: 'Suryakumar Yadav', score: 78 },
    { name: 'Kapil Dev', score: 88 },
  ];

  const T20Players = ['Suryakumar Yadav', 'Rishabh Pant', 'Hardik Pandya'];
  const RanjiTrophyPlayers = ['Cheteshwar Pujara', 'Wasim Jaffer', 'Mayank Agarwal'];
  
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  if (flag) {
    return (
      <div className="App">
        <h1>List of Players</h1>
        <ListofPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <Scorebelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div className="App">
        <h1>Odd Players</h1>
        <OddPlayers players={IndianPlayers} />
        <hr />
        <h1>Even Players</h1>
        <EvenPlayers players={IndianPlayers} />
        <hr />
        <h1>List of Indian Players Merged</h1>
        <ListofIndianPlayers players={IndianPlayers} />
      </div>
    );
  }
}

export default App;