function ListofIndianPlayers({ players }) {
  return (
    <div>
      <ul>
        {players.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
}

export default ListofIndianPlayers;
