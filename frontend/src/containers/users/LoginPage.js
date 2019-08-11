import React from 'react';
import {Link} from 'react-router-dom';

const LoginPage = (props) => {
  const options = props.users.map( (user, index ) => {
    return <option value={index} key={index}>{user.name}</option>
  })

  function handleChange(event){
    props.onUserSelected(event.target.value)
  }

  return (
    <div className="login">
      <h1>Welcome to Comic Clan!</h1>

        <select id="user-selector"
         defaultValue="default"
         onChange={handleChange}>
          <option value="" disabled>Please select your user name:</option>
          {options}
        </select>
        <br />
      <button type="submit">Enter</button>
    </div>
  );

}

export default LoginPage;
