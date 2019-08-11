import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class LoginPage extends Component {


  render(){
    return (
      <div className="login">
        <h1>Welcome to Comic Clan!</h1>

          <select name="user">
            <option value="" disabled>Please select your user name:</option>
          </select>
          <br />
        <button type="submit">Enter</button>
      </div>
    );
  }

}

export default LoginPage;
