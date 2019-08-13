import React, {Component} from 'react';
import UserEditForm from '../../components/users/UserEditForm';

class UserEditFormContainer extends Component {

  constructor(props){
    super(props);
      console.log(props);
    this.handleUserUpdate = this.handleUserUpdate.bind(this);
  }

  handleUserUpdate(updateUser){
    const request = new Request();
    request.patch('/api/users/' + this.props.user.id, updateUser).then(() => {
      window.location = '/users/' + this.props.user.id
    })
  }

  render(){
    return <UserEditForm user={this.props.user} handleUserUpdate={this.handleUserUpdate}/>
  }

}

export default UserEditFormContainer;
